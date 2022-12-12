// https://www.codewars.com/kata/55ea5304685da2fb40000018
function heggeleggleggo(word) {
  // /g defines a global search, meaning that it would search for all the instances on all the lines
  // $& is a backreference to the whole match
   return word.replace(/[^ueoaiUEOAI ]/g, "$&egg");
}
