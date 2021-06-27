// Wyniki z mongo shell

const mapFunc = function () {
    emit(this.sex, {count: 1, height: parseFloat(this.height), weight: parseFloat(this.weight)});
};

const redFunc = function (key, values) {
    let reducedValue = {height: 0, weight: 0, count: 0};

    for (let i = 0; i < values.length; i++) {
        reducedValue.height += values[i].height;
        reducedValue.weight += values[i].weight;
        reducedValue.count += values[i].count;
    }
    return reducedValue;

};

const finFunc = function (key, reducedValue) {
    reducedValue.height_avg = reducedValue.height / reducedValue.count;
    reducedValue.weight_avg = reducedValue.weight / reducedValue.count;
    return reducedValue;
};

db.people.mapReduce(
    mapFunc,
    redFunc,
    {
        out: { merge: "wyniki_1_MR" },
        finalize: finFunc
    }
);

printjson(db.wyniki_1_MR.find().toArray())
