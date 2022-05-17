USE [fashionShop]
GO

/****** Object:  Table [dbo].[items]    Script Date: 1/12/2022 1:21:04 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[items](
	[itemID] [varchar](50) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[price] [int] NOT NULL,
	[color] [varchar](50) NULL,
	[style] [varchar](50) NULL,
	[gender] [varchar](50) NULL,
 CONSTRAINT [PK_items] PRIMARY KEY CLUSTERED 
(
	[itemID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

