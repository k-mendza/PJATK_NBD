#!/usr/bin/env bash
# Usuń jeden z dokumentów z bazy.

curl -i -XDELETE http://localhost:8098/buckets/s22188/keys/4
