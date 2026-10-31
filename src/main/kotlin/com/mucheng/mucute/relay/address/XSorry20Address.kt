package com.xsorry20.client.address

import java.net.InetSocketAddress

data class XSorry20Address(val hostName: String, val port: Int)

inline val XSorry20Address.inetSocketAddress
    get() = InetSocketAddress(hostName, port)

inline val InetSocketAddress.xsorry20Address
    get() = XSorry20Address(hostName, port)
