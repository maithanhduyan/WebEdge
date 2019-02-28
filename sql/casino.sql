create table betResult (
id  numeric primary key,
betdate date,
betresult numeric,
guessLow numeric,
guessHigh numeric,
betPayin decimal,
betPayout decimal,
depositAddress varchar(128),
balance numeric
)