function getGithubLink(id){
    const axios = require('axios');
    const cheerio = require('cheerio');

    let url = "https://github.com/search?q=hangman";


    axios.get(url)
        .then(html => {
            const $ = cheerio.load(html.data);

            var nameArr = [];
            $('div.container-lg px-md-2 mt-lg-4 clearfix')
                .find('div.col-12 col-md-9 float-left px-2 pt-3 pt-md-0 codesearch-results')
                .find('ul.repo-list')
                .find('li.repo-list-item hx_hit-repo d-flex flex-justify-start py-4 public source')
                .find('div.mt-n1 flex-auto')
                .find('div.d-flex')
                .find('div.f4 text-normal')
                .find('a')
                .each((i, el) => {
                    nameArr.push(
                        $(el).text()
                            .replace(/\n/g, '')
                            .replace(/ /g, '')
                    );
                });
            
        })

}

function abc(id){
    document.getElementById(id).innerText = '<p>시발</p>';
    document.write("<p>tlqkftlqkf</p>");
}