// Wyniki z mongo shell
const mapFunc = function () {
    for (let idx = 0; idx < this.credit.length; idx++) {
        const key = this.credit[idx].currency;
        const value = {count: 1, balance: parseFloat(this.credit[idx].balance)};
        if (this.nationality === "Poland" && this.sex === "Female") {
            emit(key, value);
        }

    }
};
const redFunc = function (key, values) {
    let reducedValue = {count: 0, balance: 0};

    for (let i = 0; i < values.length; i++) {
        reducedValue.balance += values[i].balance;
        reducedValue.count += values[i].count;
    }
    return reducedValue;
};

const finFunc = function (key, reducedValue) {
    reducedValue.balance_avg = reducedValue.balance / reducedValue.count;
    return reducedValue;
};


db.people.mapReduce(
    mapFunc,
    redFunc,
    {
        out: { merge: "wyniki_5_MR" },
        finalize: finFunc
    }
);

printjson(db.wyniki_5_MR.find().toArray())
