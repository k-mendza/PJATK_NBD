#!/usr/bin/env bash
# Dodaj do bazy 1 dokument json (zawierający 1 pole), ale nie specyfikuj klucza.

curl -XPOST \
  -i \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Martyna"}' \
  http://localhost:8098/buckets/s22188/keys
