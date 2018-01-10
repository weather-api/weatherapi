from flask import Flask
import sys
import requests

app = Flask(__name__)

@app.route('/<city>',methods=['GET'])
def api_root(city): 
    city = str(city)
    st = 'https://api.openweathermap.org/data/2.5/weather?q=%s&APPID=7acac7228ba5a197fdde48b50b50cced'%str(city)
    return requests.get(st).content

if __name__ == '__main__':
    app.run()
	
#zehra yilmaz
#saliha altindis