// https://www.codewars.com/kata/57f318ce828b3553b40013ea

function displayLargeNumber(n) {
  return n.toString().replace(/(\d)(?=(\d{3})+$)/g, "$1,")
}
