USE [fashionShop]
GO

/****** Object:  Table [dbo].[members]    Script Date: 1/12/2022 1:21:14 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[members](
	[username] [nchar](10) NOT NULL,
	[password] [nchar](20) NOT NULL,
	[role] [nchar](10) NOT NULL
) ON [PRIMARY]
GO

