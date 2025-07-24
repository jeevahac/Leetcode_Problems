// Last updated: 7/24/2025, 9:25:52 PM
int lengthOfLastWord(char* s) {
    int length = 0;
    int i = strlen(s) - 1;

    // Skip trailing or last spaces
    while (i >= 0 && s[i] == ' ') {
        i--;
    }

    // Count the length of the last word
    while (i >= 0 && s[i] != ' ') {
        length++;
        i--;
    }

    return length;
}
