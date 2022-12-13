// https://www.codewars.com/kata/56c19316e8b139dff60006da
lower = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
upper = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
function makeUpper(x) {
    let index = lower.indexOf(x);
    return index > -1 ? upper[index] : x;
}
String.prototype.capitalize = function (){
    return this.replace(/^\w/, (c) => makeUpper(c));
}
