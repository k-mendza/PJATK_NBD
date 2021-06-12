//Usuń u wszystkich osób o zawodzie „Editor” własność „email”

printJson(db.people.updateMany({"job": {$eq: "Editor"}}, {$unset: {email:1}}, false, true));
