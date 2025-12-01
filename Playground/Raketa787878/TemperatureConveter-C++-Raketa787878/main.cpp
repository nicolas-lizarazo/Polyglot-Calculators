#include <exception>
#include <iostream>

int main(int argc, char* argv[]) {
    // Check arguments count
    if (argc != 3) {
        std::cerr << "Using: <value> <f or c>" << std::endl;
        return 1;
    }

    // Get arguments
    std::string arg1 = argv[1];
    std::string arg2 = argv[2];
    double value;

    // Check value
    try {
        value = std::stod(argv[1]);
    }

    catch(const std::exception& e) {
        std::cerr << "Invalid value" << std::endl;
        return 1;
    }

    if (arg2 == "f") {
        value = (value * 9/5) + 32;
        std::cout << value << std::endl;
        return 0;
    }

    else if (arg2 == "c") {
        value = (value - 32) * 5/9;
        std::cout << value << std::endl;
        return 0;
    }

    else {
        std::cerr << "Invalid unit" << std::endl;
        return 1;
    }
}