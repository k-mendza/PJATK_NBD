#!/usr/bin/env bash
# Zmodyfikuj jedną z wartości – dodając dodatkowe pole do dokument

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Jan", "lastName":"Kowalski", "age": 33, "rating": 10, "email":"kowalski@gmail.com"}' \
  http://localhost:8098/buckets/s22188/keys/1
