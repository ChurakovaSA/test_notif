theme: /

    init: 
        $jsapi.log("XXX init started");
        $http.config({
            authService: {
                service: 'external',
                name: 'Authorization',
                value: '$sam_token', // переменная из раздела Токены
                settingType: 'HEADER'
            }
        });
        $jsapi.log("XXX init finished");

    state: newNode_0
        HttpRequest:
            url = https://enenqa61rkiqdvh.m.pipedream.net
            method = GET
            body = 
            okState = /newNode_1
            errorState = 
            timeout = 5000
            headers = []
            vars = []

    state: newNode_1
        a: hello world
        script: 
            $http.get("https://enenqa61rkiqdvh.m.pipedream.net");