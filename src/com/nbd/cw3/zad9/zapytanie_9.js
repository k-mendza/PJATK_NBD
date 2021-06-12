// Dodaj do wszystkich osób o imieniu Antonio własność „hobby” o wartości „pingpong”;

printJson(db.people.updateMany({"first_name": {$eq: "Antonio"}}, { $set: { "hobby" : "pingpong" }}))
