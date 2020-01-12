function formSubmit(str){
    var input = document.getElementById("input").value
    if (input == "" || input == null){
        alert("please enter a word first")
        return
    }
    else {
        if (str=="verb")
            document.home.action="verb"
        if (str=="noun")
            document.home.action="noun"
        if (str=="adj")
            document.home.action="adjective"
        if (str=="adv")
            document.home.action="adverb"
        if (str=="" || str==null){
            alert("please choose a POS first")
            return
        }
    }
    document.home.submit();
}