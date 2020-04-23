import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import clsx from 'clsx';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import Collapse from '@material-ui/core/Collapse';
import Avatar from '@material-ui/core/Avatar';
import IconButton from '@material-ui/core/IconButton';
import Typography from '@material-ui/core/Typography';
import { red } from '@material-ui/core/colors';
import StarRateIcon from '@material-ui/icons/StarRate';
import ShareIcon from '@material-ui/icons/Share';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import {BrowserRouter as Router,Switch,Route,Link} from "react-router-dom";
import MoreVertIcon from '@material-ui/icons/MoreVert';
import Pizza from '../../resources/pizza.jpg';

const useStyles = makeStyles((theme) => ({
  root: { 
    width: 250,
  },
  media: {
    height: 0,
    paddingTop: '56.25%', // 16:9
  },
  avatar: {
    backgroundColor: red[500],
  },
}));

export default function Restaurant() {

  const classes = useStyles();

  return (
    <Card className={classes.root}>
      
    <Link to="/id">
      <CardMedia
        className={classes.media}
        image={Pizza}
      />
      </Link>
      <CardContent>
        <Typography >
          Pizzaronee
        </Typography>
        
        <Typography variant="body2" color="textSecondary" component="p">
          Pizzas
        </Typography>

      </CardContent>
      <CardActions >
        <IconButton aria-label="add to favorites">
          <StarRateIcon />
        </IconButton>
        <Typography>   35min </Typography>
        <Typography>    500 for 2</Typography>
      </CardActions>
    </Card>
  );
}
