import requests
from bs4 import BeautifulSoup as bs

page = requests.get("https://ko.jf-parede.pt/computer-science-projects-ideas/")
soup = bs(page.text, "html.parser")

title = soup.select_one('#s_content > div.section > ul > li:nth-child(1) > dl > dt > a')

for index, element in enumerate(elements, 1):
		print("{} 번째 게시글의 제목: {}".format(index, element.text))