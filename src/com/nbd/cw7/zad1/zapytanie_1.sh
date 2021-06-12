#!/usr/bin/env bash
# Umieść w bazie (nazwa bucketa ma być Twoim numerem indeksu poprzedzonym literą „s”) 5 wartości,
# gdzie każda z nich ma być dokumentem json mającym 4 pola co najmniej dwóch różnych typów

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Jan", "lastName":"Kowalski", "age": 33, "rating": 10}' \
  http://localhost:8098/buckets/s22188/keys/1

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Michal", "lastName":"Krakowski", "age": 22, "rating": 9.5}' \
  http://localhost:8098/buckets/s22188/keys/2

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Mariola", "lastName":"Warszawska", "age": 24, "rating": 9.0}' \
  http://localhost:8098/buckets/s22188/keys/3

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Zuzanna", "lastName":"Poznanska", "age": 26, "rating": 9.7}' \
  http://localhost:8098/buckets/s22188/keys/4

# List all buckets
curl -i http://localhost:8098/buckets?buckets=true

# List all keys
curl -i http://localhost:8098/buckets/s22188/keys?keys=true

# Usuniecie obiektu
curl -XDELETE http://localhost:8098/buckets/s22188/keys/1
