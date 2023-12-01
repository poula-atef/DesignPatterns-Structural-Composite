# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Composite Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي class علي شكل tree و ال branches اللي فيها من نفس نوع ال class و ليها كذا نوع لل leafs .. ال design pattern ده بيقول اننا نتعامل 
مع كل ال leafs و ال branches علي انهم من نفس النوع يعني نعاملهم بنفس المعامله .. مثلا المثال الموجود في ال application هو اننا عندنا box ممكن يتحط جواه vedio game او book (دول بيمثلو ال leafs)
او يتحط box تاني فيه حاجات تاني (ده بيمثل branch) وهكذا .. في عملية حساب السعر بنقوم بحساب سعر ال vedio games او ال books اللي موجوده و هنا قمنا بالتعامل مع
ال books و ال vedio game و ال box بنفس الشكل لاننا خليناهم كلهم بيعملوا inherit من ال product.
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال products:
  - ال Product Interface و ده فيه ال methods اللي المفروض تبقي في اي Product
  - ال Book Class و ده Leaf Product
  - ال VedioGame Class و ده Leaf Product
  - ال Box Class و ده Branch Product
