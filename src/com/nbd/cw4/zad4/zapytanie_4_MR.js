// Wyniki z mongo shell
const mapFunc = function(){
    emit(this.nationality, {count:1, BMI: (parseFloat(this.weight) / (parseFloat(this.height) * parseFloat(this.height))), MaxBMI:0, MinBMI:100});
};

const redFunc = function(key, values){
    let reducedValue = {count: 0, BMI: 0, MaxBMI: 0, MinBMI: 100};

    for (let i = 0; i < values.length; i++) {
        reducedValue.BMI += values[i].BMI;
        reducedValue.count += values[i].count;

        if (reducedValue.MinBMI > values[i].BMI) {
            reducedValue.MinBMI = values[i].BMI
        };

        if (reducedValue.MaxBMI < values[i].BMI) {
            reducedValue.MaxBMI = values[i].BMI
        };
    }
    return reducedValue;
};

const finFunc = function (key, reducedValue) {
    reducedValue.BMI_avg = reducedValue.BMI/reducedValue.count;
    return reducedValue;
};


db.people.mapReduce(
    mapFunc,
    redFunc,
    {
        out: { merge: "wyniki_4_MR" },
        finalize: finFunc
    }
);

printjson(db.wyniki_4_MR.find().toArray())
