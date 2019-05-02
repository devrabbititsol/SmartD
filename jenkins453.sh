cd /home/devrabbit/SmartQE/SmartQE-Users/7/Selenium/TestSel
curl -d @config453.xml -H 'Content-Type: text/xml' 'http://root:Rabbit%402050@192.168.1.144:8080/createItem?name=TestSel' --user root:11f5b3da0c6fe4610a997d683c98f61cbb
curl -X POST http://root:Rabbit%402050@192.168.1.144:8080/job/TestSel/config.xml --user root:11f5b3da0c6fe4610a997d683c98f61cbb --data-binary @config453.xml
curl -X POST http://root:Rabbit%402050@192.168.1.144:8080/job/TestSel/build --user root:11f5b3da0c6fe4610a997d683c98f61cbb
