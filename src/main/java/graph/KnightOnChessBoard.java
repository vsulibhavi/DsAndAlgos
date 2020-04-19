package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

//If yes, then what would be the minimum number of steps for the knight to move to the said point.
class KnightNode {

    int x;
    int y;
    int noOfMoves;

    KnightNode(int x, int y, int noOfMoves) {

        this.x = x;
        this.y = y;
        this.noOfMoves = noOfMoves;
    }

}

public class KnightOnChessBoard {


    public static void main(String[] args) {

        int[][] visited = new int[8][8];

        int targetx = 7;
        int targety = 7;
        Queue<KnightNode> s = new LinkedList();

        s.offer(new KnightNode(0, 0, 0));

        while (!s.isEmpty()) {

            KnightNode e = s.poll();
            if (e.x == 3 && e.y == 4) {
                System.out.println(e.noOfMoves);
                break;
            }
            visited[e.x][e.y] = 1;


            for (KnightNode knightNode : getPossibleMoves(e.x, e.y, e.noOfMoves, visited)) {

                s.offer(knightNode);
            }
        }
    }

    private static List<KnightNode> getPossibleMoves(int x, int y, int moves, int[][] visited) {


        // 8 possibilities

        List<KnightNode> possibleNodes = new ArrayList<>();

        possibleNodes.add(new KnightNode(x - 2, y + 1, moves + 1));
        possibleNodes.add(new KnightNode(x - 2, y - 1, moves + 1));
        possibleNodes.add(new KnightNode(x + 2, y - 1, moves + 1));
        possibleNodes.add(new KnightNode(x + 2, y + 1, moves + 1));

        possibleNodes.add(new KnightNode(x + 1, y + 2, moves + 1));
        possibleNodes.add(new KnightNode(x - 1, y + 2, moves + 1));
        possibleNodes.add(new KnightNode(x + 1, y - 2, moves + 1));
        possibleNodes.add(new KnightNode(x - 1, y - 2, moves + 1));

        return possibleNodes.stream().filter(knightNode -> knightNode.x >= 0 && knightNode.y >= 0)
                .filter(knightNode -> knightNode.x <= 7 && knightNode.y <= 7)
                .filter(knightNode -> visited[knightNode.x][knightNode.y] == 0).collect(Collectors.toList());


    }

}
