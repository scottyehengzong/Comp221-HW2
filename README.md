# Comp221-HW2
Q6
Algorithm extendName(Y, P)
note: Y is a string
note: P is a string
if Y ends with the letter "e" then
    return Y + "x" + P
else if Y ends with a vowel other then "e" then
    remove the last vowel of Y and call it newY
    return newY + "ex" + P
else if Y ends with "ex" then
    return Y + P
else
    return Y + "ex" + P

issues: the input of the substring(beginIndex, endIndex) need some attention. Initially I put the wrong number for the endIndex.
test: I put my file on Open Katties and passed the test.




Q7

Insert method: first of all, test whether the tree is empty. If the tree is empty, then insert the new value in the root node and change the emptyTree boolean from true to false.  If the tree is not empty, we need to compare the insert value with the node value. If the insert value is smaller than the node value and the node does not have a left child, we insert the new value as its new left child, if the node value has a left child, we find the left subtree rooted on the child and repeat the insert method; if the insert method is bigger than the node value and the node does not have a right child, we insert the new value as its right child, if the node has a right child, we find the right subtree rooted on the child and repear the insert method. The core stradegy is to repeat comparing the insert value with the root of the tree and subtree and find a correct position for the insert value.

test: I think Susan's test is sufficient because it covers all the situations we need to consider: insert value to an empty tree; insert value to the left-child position of a left subtree; insert value to the right-child postion of a left subtree; insert value to the left child-position of a right subtree; and insert value to the right child position of a right subtree.
