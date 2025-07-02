cmake_minimum_required(VERSION 3.10.2)

project("native")

add_library(
        get-lib
        SHARED
        get_msg.c
        hello_jni.c
)

find_library(
        log-lib
        log
)

target_link_libraries(
        get-lib
        ${log-lib}
)
