public class ListItem {
    int value;
    ListItem prevInstance;


    ListItem(int newValue, ListItem newListItem) {
        value = newValue;
        prevInstance = newListItem;
    }


}
