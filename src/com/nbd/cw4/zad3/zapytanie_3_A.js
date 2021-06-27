// Listę unikalnych zawodów;

// Wyniki z DataGrip
db.people.aggregate({$group: { _id: "$job"}})


