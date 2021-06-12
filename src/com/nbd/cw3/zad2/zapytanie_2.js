// Jedna kobieta narodowości chińskiej;
printJson(db.people.findOne({"sex":{$eq:"Female"}, "nationality":{$eq:"China"}}))
