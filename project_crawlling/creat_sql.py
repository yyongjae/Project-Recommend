import pandas as pd

data_array = pd.read_csv('/Users/mac/Documents/GitHub/Project-Recommend/project_crawlling/프로젝트 리스트 - 시트1-2.csv')

array = data_array.values.tolist()

print(array[0][1])
f = open('./sql.txt','w')
sql_list = []
cnt=0
for i in array:
    check1="True"
    check2="True"
    check3="True"

    if i[0]==False:
        check1="False"
    if i[1]==False:
        check2="False"
    if i[2]==False:
        check3="False"

    for j in i:
        print(type(j))
        

    sql_tmp = "INSERT INTO RP VALUES ("+str(cnt)+","+check1+","+check2+","+check3+","+"\""+i[3]+"\""+","+"\""+i[4]+"\""+","+"\""+str(i[5])+"\""+");\n"
    print(sql_tmp)
    f.write(sql_tmp)
    cnt=cnt+1    
f.close()

