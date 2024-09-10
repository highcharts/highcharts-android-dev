package com.highsoft.highcharts.core

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class HICustomFontTest {

    private lateinit var hiCustomFont: HICustomFont
    private lateinit var mockContext: Context
    private lateinit var mockResources: Resources

    @Before
    fun setUp() {
        hiCustomFont = HICustomFont()
        mockContext = mock(Context::class.java)
        mockResources = mock(Resources::class.java)
        `when`(mockContext.resources).thenReturn(mockResources)
    }

    @Test
    fun `returns true when adding font with valid font resource ID`() {
        val validFontId = 123 // Assuming 123 is a valid font resource ID
        setupValidFontMock(validFontId)

        val result = hiCustomFont.addFont(mockContext, validFontId)
        assertTrue(result)
    }

    @Test
    fun `returns false when adding font with invalid font resource ID`() {
        val invalidFontId = -1
        val result = hiCustomFont.addFont(mockContext, invalidFontId)
        assertFalse(result)
    }

    @Test
    fun `returns false when adding font with resource ID not representing a font`() {
        val notFontId = 456

        // Assuming 456 is a drawable resource ID
        `when`(mockResources.getResourceTypeName(notFontId)).thenReturn("drawable")

        val result = hiCustomFont.addFont(mockContext, notFontId)
        assertFalse(result)
    }

    @Test
    fun `returns false when adding font with null context`() {
        val result = hiCustomFont.addFont(null, 123)
        assertFalse(result)
    }

    @Test
    fun `font is not empty when font is added successfully`() {
        val validFontId = 456 // Assuming 456 is a valid font resource ID
        setupValidFontMock(validFontId)

        val result = hiCustomFont.addFont(mockContext, validFontId)
        assertTrue(result)
        assertNotNull(hiCustomFont.font)
        assertTrue(hiCustomFont.font.isNotEmpty())
    }

    @Test
    fun `font is empty when font is added unsuccessfully`() {
        val invalidFontId = -1

        val result = hiCustomFont.addFont(mockContext, invalidFontId)
        assertFalse(result)
        assertNotNull(hiCustomFont.font)
        assertTrue(hiCustomFont.font.isEmpty())
    }

    @Test
    fun `returns false when adding font with resource not found`() {
        val missingFontId = 789 // Assuming 789 is a valid ID but the resource is missing

        `when`(mockResources.getResourceTypeName(missingFontId)).thenThrow(
            Resources.NotFoundException(
                "Resource not found"
            )
        )

        val result = hiCustomFont.addFont(mockContext, missingFontId)
        assertFalse(result)
    }

    private fun setupValidFontMock(validFontId: Int) {
        // Mocking resource type name and entry name
        `when`(mockResources.getResourceTypeName(validFontId)).thenReturn("font")
        `when`(mockResources.getResourceEntryName(validFontId)).thenReturn("customFont")

        // Mocking the TypedValue to simulate resource retrieval
        val mockTypedValue = TypedValue().apply { string = "res/font/customFont.ttf" }
        doAnswer {
            val typedValue = it.getArgument<TypedValue>(1)
            typedValue.string = mockTypedValue.string
            null
        }.`when`(mockResources).getValue(eq(validFontId), any(TypedValue::class.java), eq(true))
    }
}
