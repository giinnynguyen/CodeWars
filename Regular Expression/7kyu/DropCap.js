// https://www.codewars.com/kata/559e5b717dd758a3eb00005a
// requirement: capitalize every word that has length greater than 2, leaving smaller words as they are.
function dropCap(n) {
    // match all the word have more than 2 character, then uppercase the first and lowercase the rest
    return n.replace(/\b\w{3,}\b/g, (n) => n.charAt(0).toUpperCase() + n.slice(1).toLowerCase())
}
