var a = {
    "query": {
        "bool": {
            "must": [
                {"match": {"message": "SELECT"}}
            ],
            "filter": [
                {
                    "range": {
                        "logtime":
                            {
                                "lte": "2016-12-29 11:04:02"
                            }
                    }
                }
            ]
        }
    }
}