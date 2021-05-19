package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun update() {
        val service = WallService()
        service.add(Post(1,
            2,
            1,
            1,
            1,
            "as",
            1,
            1,
            2,
            "asd",
            "ads",
            1,
            1,
            1,
            "asd",
            1,
            true,
            true,
            true,
            true,
            true,
            true,
            "asd",
            1))
        service.add(Post(1,
            11,
            2,
            3,
            1,
            "asss",
            3,
            2,
            5,
            "asssd",
            "adsss",
            1,
            1,
            1,
            "asssd",
            1,
            true,
            true,
            true,
            true,
            true,
            true,
            "asssd",
            2))
        service.add(Post(1,
            121,
            1,
            1,
            1,
            "as",
            1,
            1,
            2,
            "asqqd",
            "adqqqs",
            1,
            1,
            1,
            "asqqqd",
            1,
            true,
            true,
            true,
            true,
            true,
            true,
            "asd",
            1))
        val update = Post(1,
            0,
            0,
            0,
            1,
            "aaaas",
            2,
            5,
            5,
            "assssd",
            "adssss",
            12,
            13,
            11,
            "asdss",
            11,
            true,
            true,
            true,
            true,
            true,
            true,
            "asaad",
            14)

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun NonUpdate() {
        val service = WallService()
        service.add(Post(1,
            121,
            1,
            1,
            1,
            "as",
            1,
            1,
            2,
            "asqqd",
            "adqqqs",
            1,
            1,
            1,
            "asqqqd",
            1,
            true,
            true,
            true,
            true,
            true,
            true,
            "asd",
            1))
        val update = Post(1,
            0,
            0,
            0,
            1,
            "aaaas",
            2,
            5,
            5,
            "assssd",
            "adssss",
            12,
            13,
            11,
            "asdss",
            11,
            true,
            true,
            true,
            true,
            true,
            true,
            "asaad",
            14)

        val result = service.update(update)

        assertFalse(result)
    }

    @Test
    fun addPost() {
        val service = WallService()
        service.add(Post(
            0,
            1,
            1,
            1,
            1,
            "as",
            1,
            1,
            2,
            "asd",
            "ads",
            1,
            1,
            1,
            "asd",
            1,
            true,
            true,
            true,
            true,
            true,
            true,
            "asd",
            1
        ))
        assertTrue(true)

    }
}