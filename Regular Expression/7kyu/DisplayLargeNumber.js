// https://www.codewars.com/kata/57f318ce828b3553b40013ea 
// format the large number. Exp: 123456789 to 123,456,789
// lookahead
function displayLargeNumber(n) {
  return n.toString().replace(/(\d)(?=(\d{3})+$)/g, "$1,")
}
