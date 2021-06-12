#!/usr/bin/env bash
# Zmodyfikuj jedną z wartości – zmieniając wartość jednego z pól.

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Mariola", "lastName":"Warszawska", "age": 25, "rating": 9.0}' \
  http://localhost:8098/buckets/s22188/keys/3
