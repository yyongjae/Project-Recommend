
import firebase_admin
import pandas as pd
from firebase_admin import credentials
from firebase_admin import db
import os

cred = credentials.Certificate("/Users/mac/Documents/GitHub/Project-Recommend/Server_util/recommend-project-db-hosting-firebase-adminsdk-uy78s-ce04978769.json")
firebase_admin.initialize_app(cred,{
    'databaseURL' : 'https://recommend-project-db-hosting-default-rtdb.firebaseio.com/'
})

ref = db.reference('Project_list/') #db 위치 지정, 기본 가장 상단을 가르킴


data_array = pd.read_csv('/Users/mac/Documents/GitHub/Project-Recommend/project_crawlling/프로젝트 리스트 - 시트1-2.csv')

array = data_array.values.tolist()

cnt=0

for i in array:
    i[0]="True"
    i[1]="True"
    i[2]="True"

    if i[0]==False:
        i[0]="False"
    if i[1]==False:
        i[1]="False"
    if i[2]==False:
        i[2]="False"
    if type(i[5])==float:
        i[5]="none"
        
    print(i)
    ref.update({cnt : i}) #해당 변수가 없으면 생성한다.
    cnt=cnt+1
