#!/usr/bin/env bash
# Zmodyfikuj jedną z wartości – usuwając jedną pole z wybranego dokumentu.

curl -XPUT \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Michal", "lastName":"Krakowski", "age": 22}' \
  http://localhost:8098/buckets/s22188/keys/2
