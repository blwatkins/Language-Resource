from random import random

def selectRandomIndex(probs):
    selector = random()
    chosen_index = -1
    for index in range(len(probs)):
        if selector < probs[index]:
            chosen_index = index
            break
        else:
            if index == len(probs) - 1:
                chosen_index = index
            else:
                selector -= probs[index]
    return chosen_index