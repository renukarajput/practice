

    select reviewer_name from reviewers,ratings
    where reviewers.reviewer_id=ratings.reviewer_id
    and ratings.reviewer_stars is null;

-- or alternatively use left join as below
select * from (SELECT Customers.CustomerName as cname, Orders.OrderID as orderId
FROM Customers
LEFT JOIN Orders
ON Customers.CustomerID=Orders.CustomerID) sub
where orderId is null



  select name from ( select reviewers.reviewer_name as name,ratings as stars from reviewers left join ratings
    on reviewers.reviewer_id=ratings.reviewer_id
    )sub
    where stars is null;


