// https://www.codewars.com/kata/568dc69683322417eb00002c
// check if the first appearance of x is xxx

//First Solution
function tripleX(str){
  const xIndex = str.indexOf('x');
  return str[xIndex + 1] === 'x' && str[xIndex + 2] === 'x';
  // or return xIndex === str.indexOf('xxx');
}

//Second Solution
function tripleX(str){
  return /^[^x]*xxx/.test(str);
}
