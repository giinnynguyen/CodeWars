// https://www.codewars.com/kata/5545f847bd94d050be00011d
// find a word in a text string
function wordSearch(word, text){
  const regex = new RegExp(`\\b${word}\\b`);
  return regex.test(text)
}
