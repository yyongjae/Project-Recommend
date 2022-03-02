/**
 * 
 */
function getCheckboxValue()  {
    // 선택된 목록 가져오기
    const query = 'input[name="chk"]:checked';
    const selectedEls =
        document.querySelectorAll(query);

    // 선택된 목록에서 value 찾기
    var result = [];
    selectedEls.forEach((el) => {
        result.push(el.id);
    });

    // 출력
    // document.getElementById('result').innerText
    //     = result;
    window.alert(result);
}