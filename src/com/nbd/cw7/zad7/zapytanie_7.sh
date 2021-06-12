#!/usr/bin/env bash
# Spróbuj pobrać z bazy wartość, która nie istnieje w tej bazie.

curl -i -XGET http://localhost:8098/buckets/s22188/keys/111
