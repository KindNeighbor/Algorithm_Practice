import sys

def solution(wallpaper):
    
    xMin = sys.maxsize
    yMin = sys.maxsize
    xMax = -1
    yMax = -1
    
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == '#':
                xMin = min(i,xMin)
                yMin = min(j,yMin)
                xMax = max(i+1,xMax)
                yMax = max(j+1,yMax)

    return [xMin, yMin, xMax, yMax]