// https://www.codewars.com/kata/5b37a50642b27ebf2e000010
function sumOfABeach(beach) {
    const matches = beach.match(/sand|water|fish|sun/gi);
    return matches ? matches.length : 0;
}
