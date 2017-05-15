cd springboot-writers
echo "starting writers project"
nohup gradle bootRun &
cd ../springboot-masterpieces
echo "starting masterpieces project"
nohup gradle bootRun &
cd ../springboot-productions
echo "starting production project"
nohup gradle bootRun &
