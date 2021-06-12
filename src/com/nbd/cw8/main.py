import json
import requests

host = 'localhost'
port = '8098'
bucket_name = 's22188'
base_url = 'http://' + host + port + '/buckets/' + bucket_name + '/keys/'

headers = {'Content-Type': 'application/json'}


def put_document(key, document):
    url = base_url + str(key)
    body = json.dumps(document)
    return requests.put(url, headers=headers, data=body)


def read_document_by_id(key):
    url = base_url + str(key)
    return requests.get(url)


def delete_document(key):
    url = base_url + str(key)
    return requests.delete(url)


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    doc = {'firstName': 'Marian', 'lastName': 'Gdanski', 'age': 45, 'rating': 5}

    text_file = open("komunikaty.txt", "wt")

    createResult = put_document(1, doc)
    text_file.write(str(read_document_by_id(1).content) + '\n')

    put_document(1, {'firstName': 'Bartosz', 'lastName': 'Lublinski', 'age': 34, 'rating': 8.7})
    text_file.write(str(read_document_by_id(1).content) + '\n')

    deleteResult = delete_document(1)
    text_file.write(str(read_document_by_id(1).content) + '\n')

    text_file.close()
