<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
   <html>
   <head>
   <style>
   h2{
      text-align :center;
      color:hotpink;
      font-size:36px;
      padding-top:10px;
    }
   div{
      padding-top:100px;
      padding-left:33%;
    }
   th{
      background-color: #83e1f8;
    }
    </style>
    </head>
      <body>
        <h2>Books Catalog</h2>
        <div>
        <table border="1">
          <tr>
            <th>Category</th>
            <th>Book Id</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
          </tr>
          <xsl:apply-templates select="books/book"/>
        </table>
        </div>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="book">
    <tr>
      <td>
        <xsl:value-of select="@category"/>
      </td>
      <td>
        <xsl:value-of select="@bookid"/>
      </td>
      <td>
        <xsl:value-of select="titleofbook"/>
      </td>
      <td>
        <xsl:value-of select="author"/>
      </td>
      <td>
        <xsl:value-of select="price"/>
      </td>
    </tr>
  </xsl:template>

</xsl:stylesheet>
