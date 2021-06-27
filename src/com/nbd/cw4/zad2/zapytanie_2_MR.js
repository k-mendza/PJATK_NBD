// Wyniki z mongo shell

const mapFunc = function(){
    for (let idx = 0; idx < this.credit.length; idx++) {
        const key = this.credit[idx].currency;
        const value = {balance: parseFloat(this.credit[idx].balance)};
        emit(key, value);
    }
};

const redFunc = function(key, values){
    let reducedValue = {balance: 0};
    for (let i = 0; i < values.length; i++){
        reducedValue.balance += values[i].balance;
    }
    return reducedValue;
};


db.people.mapReduce(
    mapFunc,
    redFunc,
    {
        query:{},
        out: { merge: "wyniki_2_MR" }
    }
);

printjson(db.wyniki_2_MR.find().toArray())
