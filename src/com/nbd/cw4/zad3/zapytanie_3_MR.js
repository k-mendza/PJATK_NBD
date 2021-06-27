// Wyniki z mongo shell
const mapFunc = function(){
    emit(this.job, this.job);
};

const redFunc = function(key, values){
    return key;
};

db.people.mapReduce(
    mapFunc,
    redFunc,
    {
        query:{},
        out: { merge: "wyniki_3_MR" },
    }
);

printjson(db.wyniki_3_MR.find().toArray())
