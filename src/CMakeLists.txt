cmake_minimum_required (VERSION 2.8.11)
project (helloworld)

add_executable(helloworld helloworld.cpp)
install(FILES "${CMAKE_CURRENT_BINARY_DIR}/helloworld"
        DESTINATION bin)
