package test;

import java.util.ArrayList;

public class FactBase {
	/*void AddToChain(String) Ц добавл€ет в список строку с идентификатор вершины или ребра.
List<String> GetChain() Ц возвращает цепочку выбора.
int GetChainSize() Ц возвращает количество элементов в цепочке.
void ResetChain() Ц сбрасывает список и приводит его к начальному состо€нию.
*/
    private static ArrayList<String> Chain = new ArrayList<String>();
    private static int chainSize = 0;

    public static void AddToChain(String s)
    {
        Chain.add(s);
        chainSize++;
    }

    public static void ResetChain()
    {
        Chain.clear();
        chainSize = 0;
    }

    public static ArrayList<String> GetChain()
    {
        return Chain;
    } 

    public static int GetChainSize()
    {
        return chainSize;
    }


}
